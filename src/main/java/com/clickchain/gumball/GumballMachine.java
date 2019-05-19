package com.clickchain.gumball;
import gumballtest.*;

public class GumballMachine{
    GumballHardwareDevice device;
    TestDevice testDevice;
    public GumballMachine(GumballHardwareDevice device,TestDevice testDevice) {
        this.device = device;
        this.testDevice = testDevice;
        device.displayLine(Messages.SO_START);
    }


    public void insertQuarter(){

        if(testDevice.hasEjected() == true && testDevice.getCount() == 0){
            device.displayLine(Messages.SO_QUART);
            testDevice.removeQuarter();
        }
        else if(testDevice.hasEjected() == false && testDevice.getCount() > 0){
                device.displayLine(Messages.NQ_QUART);
        }
        else if(testDevice.hasEjected() && testDevice.getCount() > 0 && testDevice.getCountquarter() == testDevice.getNumOfQuarter()+2){
            device.displayLine(Messages.HQ_QUART);
            testDevice.removeQuarter();
        }
        else if(testDevice.hasEjected() && testDevice.getCount() > 0){
            device.displayLine(Messages.SL_QUART);
            testDevice.removeQuarter();
        }
    }

    public void ejectQuarter(){
        if(!testDevice.hasEjected() && testDevice.getCount() == 0){
            device.displayLine(Messages.SO_EJECT);
        }
        else if(!testDevice.hasEjected() && testDevice.getCount() > 0){
            device.displayLine(Messages.NQ_EJECT);
        }
        else if(testDevice.hasEjected() && testDevice.getCount() > 0){
            device.displayLine(Messages.HQ_EJECT);
            testDevice.removeQuarter();
        }
    }

    public void turnCrank(){
        if(testDevice.hasEjected() == true && testDevice.getCount() == 0){
            device.displayLine(Messages.SO_CRANK);
        }
        else if(testDevice.hasEjected() == false && testDevice.getCount() > 0){
            device.displayLine(Messages.NQ_CRANK);
        }
        else if(testDevice.hasEjected() && testDevice.getCount() > 0){
            device.displayLine(Messages.HQ_CRANK);
            testDevice.releaseGumball();
        }
    }

    public void takeGumball(){

        if(testDevice.hasEjected() && testDevice.getCount() == 0){
            device.displayLine(Messages.SO_TAKE);
        }
        else if(!testDevice.hasEjected() && testDevice.getCount() > 0){
            device.displayLine(Messages.NQ_TAKE);
        }
        else if(testDevice.hasEjected() && testDevice.getCount() > 0){
            device.displayLine(Messages.HQ_TAKE);
        }
    }

    public void refill(){
        testDevice.addGumballs(1);
    }
}
