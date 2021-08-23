package com.lucky.patterns.facade;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 14:01
 * @Description: com.lucky.patterns.facade
 * @VERSION: 1.0
 */
public class LetterFacade {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private PoliceCheck policeCheck = new PoliceCheck();
    public void writeLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        //装入信封之前，警察进行检查
        policeCheck.checkContext(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
