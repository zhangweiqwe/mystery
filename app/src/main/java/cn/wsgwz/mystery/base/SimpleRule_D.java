package cn.wsgwz.mystery.base;

public class SimpleRule_D extends BaseRule  {

    @Override
    public int RD(int i, int j) {
        double a = 0, b = 0, c, d, n = 0;
        while ((c = a * a) + (d = b * b) < 4 && n++ < 880) {
            b = 2 * a * b + j * 8e-9 - .645411;
            a = c - d + i * 8e-9 + .356888;
        }
        return (int) (255 * Math.pow((n - 80) / 800, 3.));
    }

    @Override
    public int GR(int i, int j) {
        double a = 0, b = 0, c, d, n = 0;
        while ((c = a * a) + (d = b * b) < 4 && n++ < 880) {
            b = 2 * a * b + j * 8e-9 - .645411;
            a = c - d + i * 8e-9 + .356888;
        }
        return (int) (255 * Math.pow((n - 80) / 800, .7));
    }

    @Override
    public int BL(int i, int j) {
        double a = 0, b = 0, c, d, n = 0;
        while ((c = a * a) + (d = b * b) < 4 && n++ < 880) {
            b = 2 * a * b + j * 8e-9 - .645411;
            a = c - d + i * 8e-9 + .356888;
        }
        return (int) (255 * Math.pow((n - 80) / 800, .5));
    }
}
