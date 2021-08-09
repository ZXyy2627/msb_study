package com.lucky.testEnum.enum04;

public enum Season implements TestInterface{
    SPRING{
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };

    /**
     * 一般情况下，不会以这种方式重写接口方法
     */
//    @Override
//    public void show() {
//        System.out.println("这是Season...");
//    }
}
