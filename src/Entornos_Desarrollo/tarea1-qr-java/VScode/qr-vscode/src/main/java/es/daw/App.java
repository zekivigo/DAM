package es.daw;

import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Hello world!
 *
 */
public class App 
{

	/**
     * Método main principal
     * @param args Argumentos del programa
     * @throws Exception Excepción en caso de error
     */
    public static void main(String[] args) throws Exception {

        // Solicitamos entrada por teclado del usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Texto o URL para el QR: ");

        String texto = teclado.nextLine().trim();

        // Verificamos entrada de usuario
        if (texto.isEmpty()) {
            System.out.println("Error: el texto está vacío.");
            return;
        }

        // Creamos una instancia de la clase generadora de códigos QR y la configuramos
        QRCodeWriter writer = new QRCodeWriter();
        Map<EncodeHintType, Object> opciones = Map.of(EncodeHintType.CHARACTER_SET, "UTF-8");
        BitMatrix matriz = writer.encode(texto, BarcodeFormat.QR_CODE, 300, 300, opciones);

        // Creamos el archivo .png que contendrá el código QR generado
        Path destino = Path.of("qr.png");
        MatrixToImageWriter.writeToPath(matriz, "PNG", destino);
        System.out.println("QR guardado en: " + destino.toAbsolutePath());
    }
}


