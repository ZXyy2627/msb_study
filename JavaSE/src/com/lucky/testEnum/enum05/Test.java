package com.lucky.testEnum.enum05;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(15);
        person.setName("lucky");
        person.setSex(Gender.男);
        //但是这样不好，因为对于性别而言，逻辑上来说不应该有其它值出现
        //person.setSex("abcdefg"); 所以这时候应该上枚举

        //还有一个用法就是switch case配合Enum使用  这两种方式是用得最多的
        Gender sex = person.getSex();
        switch (sex) {
            case 男:
                System.out.println("是个男的");
                break;
            case 女:
                System.out.println("是个女的");
                break;
        }
    }
}
