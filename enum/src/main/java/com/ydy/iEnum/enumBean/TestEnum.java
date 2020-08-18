package com.ydy.iEnum.enumBean;


public enum TestEnum {
    Apple(1),Banana(2),Car(3);

    private int value;

    TestEnum(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
