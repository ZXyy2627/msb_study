package com.lucky.patterns.facade;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 13:57
 * @Description: com.lucky.patterns.facade
 * @VERSION: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //原有的写信过程，我们需要按照完整且正确的流程来调用方法，完成信件的全过程
        /*ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("你好，我是你爸爸！我很好，不用问候我");
        letterProcess.fillEnvelope("湖北省武汉市硚口区");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();*/
        //就这样，我们按照流程完成了写信的过程，但是这里面包含了业务逻辑，并且不容易扩展，也就是不符合开闭原则，
        //也不符合单一职责原则 那么如何修改呢？我们引入门面模式，让写信的过程不再与具体业务逻辑交互，而是与一个门面类交互
        /*
        * 现在我们已经封装好了一个门面类，不需要再与业务逻辑交互，只需要调用写信的方法即可
        * */
        LetterFacade letterFacade = new LetterFacade();
        letterFacade.writeLetter("你好，我是你爸爸，不用问候我，我不想理你","湖北省武汉市硚口区");
        /*
        * 从结果上可以看到，这样的方式已经完成了写信的过程，客户端代码已经变得简洁
        * 现在我们要扩展功能，在发送新建的过程中，警察需要对新建进行检查，避免出现违禁物品
        * 我们可以直接在门面模式中修改代码，扩展功能，而不用修改客户端代码
        *
        * 可以看到，我们扩展了警察检查信件的过程，但是客户端对代码的调用并没有任何修改
        * */
    }
}
