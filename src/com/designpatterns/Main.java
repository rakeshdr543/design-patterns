package com.designpatterns;

import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.state.BrushTool;
import com.designpatterns.state.Canvas;
import com.designpatterns.state.EraserTool;
import com.designpatterns.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
        System.out.println("hey rakesh, kudose bro for learning design patterns");

        // State Pattern
        var canvas=new Canvas();
        canvas.setCurrentTool(new BrushTool());
        var ct1= canvas.getCurrentTool();
        ct1.mouseDown();
        ct1.mouseUp();

        canvas.setCurrentTool(new SelectionTool());
        var ct2= canvas.getCurrentTool();
        ct2.mouseDown();
        ct2.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        var ct3= canvas.getCurrentTool();
        ct3.mouseDown();
        ct3.mouseUp();
//        var editor= new Editor();
//        var history=new History();
// // Memento Pattern
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

    public  static void getDraw(UIControl ui){
         ui.draw();
    }
    public static IncomeCalculator2023 calculate(){
        return new IncomeCalculator2023();
    }


}
