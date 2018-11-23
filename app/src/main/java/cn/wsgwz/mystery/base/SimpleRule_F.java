package cn.wsgwz.mystery.base;

import org.jetbrains.annotations.Nullable;

public class SimpleRule_F extends BaseRule {
    private int DIM = 1024;
    private int DIM1 = DIM - 1;

    @Override
    public int RD(int i, int j) {
        float s = 3.f / (j + 99);
        float y = (j + (float) Math.sin((i * i + BaseRule.Companion._sq(j - 700) * 5) / 100.f / DIM) * 35) * s;
        return ((int) ((i + DIM) * s + y) % 2 + (int) ((DIM * 2 - i) * s + y) % 2) * 127;
    }

    @Override
    public int GR(int i, int j) {
        float s = 3.f / (j + 99);
        float y = (j + (float)Math.sin((i * i +BaseRule.Companion. _sq(j - 700) * 5) / 100.f/ DIM) * 35) * s;
        return ((int)(5 * ((i + DIM) * s + y)) % 2 +(int)(5 * ((DIM * 2 - i) * s + y)) % 2)*127;
    }

    @Override
    public int BL(int i, int j) {
        float s = 3.f/ (j + 99);
        float y = (j + (float)Math.sin((i * i + BaseRule.Companion. _sq(j - 700) * 5) / 100. / DIM) * 35) * s;
        return ((int)(29 * ((i + DIM) * s + y)) % 2 +(int)(29 * ((DIM * 2 - i) * s + y)) % 2)*127;


    }


}
