package com.designpatterns;

import com.designpatterns.adapter.Assignment;
import com.designpatterns.adapter.PenAdapter;
import com.designpatterns.builder.Phone;
import com.designpatterns.builder.PhoneBuilder;
import com.designpatterns.composite.Component;
import com.designpatterns.composite.Composite;
import com.designpatterns.composite.LeafComponent;
import com.designpatterns.factory.Android;
import com.designpatterns.factory.OS;
import com.designpatterns.factory.OSFactory;
import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.observerPattern.observable.IphoneObservable;
import com.designpatterns.observerPattern.observable.StockObservable;
import com.designpatterns.observerPattern.observer.EmailNotification;
import com.designpatterns.observerPattern.observer.MobileNotification;
import com.designpatterns.observerPattern.observer.NotificationAlertObserver;
import com.designpatterns.state.BrushTool;
import com.designpatterns.state.Canvas;
import com.designpatterns.state.EraserTool;
import com.designpatterns.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey rakesh, kudose bro for learning design patterns");

        StockObservable iphoneObservable= new IphoneObservable();
        NotificationAlertObserver emailObserver= new EmailNotification("rakesh@mail.com",iphoneObservable);
        NotificationAlertObserver mobileObserver=new MobileNotification("956745367634",iphoneObservable);

        iphoneObservable.add(emailObserver);
        iphoneObservable.add(mobileObserver);


        iphoneObservable.addStockCount(10);
        iphoneObservable.addStockCount(0);
        iphoneObservable.addStockCount(100);

//        // Composite Pattern
//        Component hd=new LeafComponent(4500,"Harddrive");
//        Component cpu = new LeafComponent(8000,"CPU");
//        Component ram = new LeafComponent(3500,"RAM");
//        Component monitor=new LeafComponent(9000,"Monitor");
//        Component mouse=new LeafComponent(500,"Mouse");
//
//
//        Composite mb=new Composite("MotherBoard");
//        mb.addComponents(cpu);
//        mb.addComponents(ram);
//
//        Composite pp=new Composite("Peripheral");
//        pp.addComponents(monitor);
//        pp.addComponents(mouse);
//
//        Composite cab=new Composite("Cabinet");
//        cab.addComponents(hd);
//        cab.addComponents(mb);
//
//        Composite computer=new Composite("Computer");
//        computer.addComponents(pp);
//        computer.addComponents(cab);
//
//        computer.showPrice();


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
