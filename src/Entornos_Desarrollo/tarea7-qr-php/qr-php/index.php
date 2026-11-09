<?php

require __DIR__ . '/vendor/autoload.php';

use chillerlan\QRCode\QRCode;

$texto = trim($_POST['texto'] ?? '');
$error = '';
$imagen = '';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    if ($texto === '') {
        $error = 'Error: el texto está vacío.';
    } else {
        $imagen = (new QRCode())->render($texto);
    }
}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Generador de QR (PHP)</title>
</head>
<body>
    <h1>Generador de QR</h1>
    <form method="post">
        <input type="text" name="texto" placeholder="Texto o URL" value="<?= htmlspecialchars($texto) ?>">
        <button type="submit">Generar</button>
    </form>

    <?php if ($error): ?>
        <p style="color: red;"><?= $error ?></p>
    <?php endif; ?>

    <?php if ($imagen): ?>
        <img src="<?= $imagen ?>" alt="Código QR" width="300">
    <?php endif; ?>
</body>
</html>