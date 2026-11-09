import qrcode

texto = input("Introduce el texto para el QR: ").strip()

if not texto:
    print("Error: el texto está vacío.")
else:
    img = qrcode.make(texto)
    img.save("qr.png")
    print("QR guardado en qr.png")