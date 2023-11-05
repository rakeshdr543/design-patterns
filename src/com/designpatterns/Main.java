package com.designpatterns;

import com.designpatterns.adapter.Assignment;
import com.designpatterns.adapter.PenAdapter;
import com.designpatterns.builder.Phone;
import com.designpatterns.builder.PhoneBuilder;
import com.designpatterns.factory.Android;
import com.designpatterns.factory.OS;
import com.designpatterns.factory.OSFactory;
import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.state.BrushTool;
import com.designpatterns.state.Canvas;
import com.designpatterns.state.EraserTool;
import com.designpatterns.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey rakesh, kudose bro for learning design patterns");

        // Composite Pattern



        // Adapter Pattern
//        var p=new PenAdapter();
//        var assignment=new Assignment();
//        assignment.setPen(p);
//        assignment.writeAssignment();

// Builder Pattern
//        var phone=new Phone("android",5000,128,8,"Silver","Pro");
//        System.out.println( phone);
//
//        Phone phoneB= new PhoneBuilder().setOs("android").setBattery(5000).setRam(12).setVariant("pro").setColor("Silver").buildPhone();
//        System.out.println(phoneB);

        // Factory Pattern
//        OSFactory osf=new OSFactory();
//        OS os1=osf.getInstance("android");
//        os1.spec();
//        OS os2=osf.getInstance("ios");
//        os2.spec();

        // State Pattern
//        var canvas=new Canvas();
//        canvas.setCurrentTool(new BrushTool());
//        var ct1= canvas.getCurrentTool();
//        ct1.mouseDown();
//        ct1.mouseUp();
//
//        canvas.setCurrentTool(new SelectionTool());
//        var ct2= canvas.getCurrentTool();
//        ct2.mouseDown();
//        ct2.mouseUp();
//
//        canvas.setCurrentTool(new EraserTool());
//        var ct3= canvas.getCurrentTool();
//        ct3.mouseDown();
//        ct3.mouseUp();




        // Memento Pattern
//        var editor= new Editor();
//        var history=new History();
//
//        editor.setContent("c");
//        history.push(editor.createState());
//        editor.setContent("c++");
//        history.push(editor.createState());
//        editor.setContent("java");
//        history.push(editor.createState());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());

//        User user = new User("Rakesh");
//        user.printName();

        // Polymorphism
//        getDraw(new CheckBox());
//        getDraw(new TextBox());

        // Inheritance
//        var textBox=new TextBox();
//        textBox.enable();
//        textBox.disable();


        // Abstraction
//        var email=new Email();
//        email.sendEmail();

        // Encapsulation
//        Account account=new Account();
//                System.out.println(account.getBalance());
//                account.deposit(120.3F);
//                account.withdraw(12F);
//                System.out.println(account.getBalance());


        //interface
//        IncomeCalculator ic=calculate();
//        System.out.println(ic.calculateIncome());
    }

//    public  static void getDraw(UIControl ui){
//         ui.draw();
//    }
//    public static IncomeCalculator2023 calculate(){
//        return new IncomeCalculator2023();
//    }


}
