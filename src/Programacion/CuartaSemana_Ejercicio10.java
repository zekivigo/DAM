package Programacion;

public class CuartaSemana_Ejercicio10 {
    public static void ejercicio10(){
        System.out.println("Ejercicio 10");
        float x = 4.5f;
        float y = 3.0f;

        int i = 2;
        int j = (int) (i * x);
        System.out.println("j int vale: " + j);

        double dx = 2.0;
        double dz = (double) (dx * y);
        System.out.println("dz double vale: " + dz);

        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by);
        System.out.println("bz byte vale: " + bz);
        bx = -128;
        by = 1;
        bz = (byte) (bx - by);
        System.out.println("bz byte2 vale: " + bz);
        int z = (int) (bx - by);
        System.out.println("z byte_a_int vale: " + z);

        short sx = 5;
        short sy = 2;
        short sz = (short) (sx * sy);
        System.out.println("sz short vale: " + sz);
        sx = 32767;
        sy = 1;
        sz = (short) (sx + sy);
        System.out.println("sz short2 vale: " + sz);

        char cx = '\u000F';
        char cy = '\u0001';

        z = (int) (cx - cy);
        System.out.println("z int vale: " + z);
        z = (int) (cx - 1);
        System.out.println("z int2 vale: " + z);
        cx = '\uFFFF';
        System.out.println("cx vale: " + cx);
        z = (int) cx;
        System.out.println("z int3 vale: " + z);
        sx = (short) cx;
        System.out.println("sx short vale: " + sx);
        sx = (short) -32768;
        System.out.println("sx short2 vale: " + sx);
        cx = (char) sx;
        System.out.println("cx char vale: " + cx);
        z = (int) cx;
        System.out.println("z int4 vale: " + z);
        sx = (short) -1;
        System.out.println("sx short3 vale: " + sx);
        cx = (char) sx;
        System.out.println("cx char2 vale: " + cx);
        z = (int) cx;
        System.out.println("z int5 vale: " + z);
    }

    public static void main(String[] args) {}
}
