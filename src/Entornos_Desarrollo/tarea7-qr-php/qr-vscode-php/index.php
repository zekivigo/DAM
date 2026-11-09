<?php
require __DIR__ . '/vendor/autoload.php';

use chillerlan\QRCode\QRCode;
use chillerlan\QRCode\QROptions;
use chillerlan\QRCode\Common\EccLevel;
use chillerlan\QRCode\Output\QROutputInterface;

$texto = trim($_POST['texto'] ?? '');
$nivelSeleccionado = $_POST['nivel'] ?? 'L';
$error = '';
$imagen = '';

$nivelesEcc = [
    'L' => EccLevel::L,
    'M' => EccLevel::M,
    'Q' => EccLevel::Q,
    'H' => EccLevel::H,
];

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if ($texto === '') {
        $error = 'Error: el texto está vacío.';
    } else {
$opciones = new QROptions([
    'outputType' => QROutputInterface::GDIMAGE_PNG,
    'eccLevel'   => EccLevel::H,
    'scale'      => 10,
]);
$imagen = (new QRCode($opciones))->render($texto);
    }
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Generador QR Avanzado</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f4f4f9; display: flex; flex-direction: column; align-items: center; margin-top: 40px; }
        .contenedor { background: white; padding: 30px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); text-align: center; }
        input, select, button { padding: 10px; margin: 5px; border: 1px solid #ccc; border-radius: 5px; }
        button { background-color: #0078D7; color: white; border: none; cursor: pointer; font-weight: bold; }
        button:hover { background-color: #005A9E; }
    </style>
</head>
<body>
    <div class="contenedor">
        <h1>Generador de QR Avanzado</h1>
        <form method="post">
            <input type="text" name="texto" placeholder="Texto o URL" value="<?= htmlspecialchars($texto) ?>">
            
            <select name="nivel">
                <option value="L" <?= $nivelSeleccionado === 'L' ? 'selected' : '' ?>>Nivel L (Bajo)</option>
                <option value="M" <?= $nivelSeleccionado === 'M' ? 'selected' : '' ?>>Nivel M (Medio)</option>
                <option value="Q" <?= $nivelSeleccionado === 'Q' ? 'selected' : '' ?>>Nivel Q (Alto)</option>
                <option value="H" <?= $nivelSeleccionado === 'H' ? 'selected' : '' ?>>Nivel H (Máximo)</option>
            </select>

            <button type="submit">Generar PNG</button>
        </form>

        <?php if ($error): ?>
            <p style="color: red;"><?= $error ?></p>
        <?php endif; ?>

        <?php if ($imagen): ?>
            <br>
            <img src="<?= $imagen ?>" alt="Código QR" width="300" style="border: 1px solid #ddd; border-radius: 5px; padding: 10px; background: white;">
        <?php endif; ?>
    </div>
</body>
</html>