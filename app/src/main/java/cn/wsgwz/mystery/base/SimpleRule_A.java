package cn.wsgwz.mystery.base;

import org.jetbrains.annotations.Nullable;

public class SimpleRule_A extends BaseRule  {

    @Override
    public int RD(int i, int j) {
        return (char)(BaseRule.Companion._sq(Math.cos(Math.atan2(j-512,i-512)/2))*255);
    }

    @Override
    public int GR(int i, int j) {
        return (char)(BaseRule.Companion._sq(Math.cos(Math.atan2(j-512,i-512)/2-2*Math.acos(-1)/3))*255);
    }

    @Override
    public int BL(int i, int j) {
        return (char)(BaseRule.Companion._sq(Math.cos(Math.atan2(j-512,i-512)/2+2*Math.acos(-1)/3))*255);
    }


}
