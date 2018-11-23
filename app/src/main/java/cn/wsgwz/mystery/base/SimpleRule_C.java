package cn.wsgwz.mystery.base;

import org.jetbrains.annotations.Nullable;

import static java.lang.Math.log;

public class SimpleRule_C extends BaseRule {

    @Override
    public int RD(int i, int j) {
        float x = 0, y = 0;
        int k;
        for (k = 0; k++ < 256; ) {
            float a = x * x - y * y + (i - 768.0f) / 512;
            y = 2 * x * y + (j - 512.0f) / 512;
            x = a;
            if (x * x + y * y > 4) break;
        }
        return (int) (log(k) * 47);

    }

    @Override
    public int GR(int i, int j) {
        float x = 0, y = 0;
        int k;
        for (k = 0; k++ < 256; ) {
            float a = x * x - y * y + (i - 768.0f) / 512;
            y = 2 * x * y + (j - 512.0f) / 512;
            x = a;
            if (x * x + y * y > 4) break;
        }
        return (int) (log(k) * 47);

    }

    @Override
    public int BL(int i, int j) {
        float x = 0, y = 0;
        int k;
        for (k = 0; k++ < 256; ) {
            float a = x * x - y * y + (i - 768.0f) / 512;
            y = 2 * x * y + (j - 512.0f) / 512;
            x = a;
            if (x * x + y * y > 4) break;
        }
        return (int) (128 - log(k) * 23);


    }


}
