package university.management.system;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.*;
public class main_class extends JFrame implements ActionListener {
    main_class(){
        //handling image that will appear on the main screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/college.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,750,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);
        //adding the menu bar like we add navbar in react
        JMenuBar mb = new  JMenuBar();

        //new information - section
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setForeground(Color.BLACK);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setForeground(Color.BLACK);
        newInfo.add(studentInfo);

        //details section
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("Faculty Details");
        facultydetails.setForeground(Color.BLACK);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setForeground(Color.BLACK);
        details.add(studentdetails);

        //Leave
        JMenu Leave = new JMenu("Apply Leave");
        details.setForeground(Color.BLACK);
        mb.add(Leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setForeground(Color.BLACK);
        Leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setForeground(Color.BLACK);
        Leave.add(studentLeave);

        //Leave Details
        JMenu LeaveDetails = new JMenu("Leave Details");
        LeaveDetails.setForeground(Color.BLACK);
        mb.add(LeaveDetails);

        JMenuItem facultyLeaveDetail = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetail.setForeground(Color.BLACK);
        LeaveDetails.add(facultyLeaveDetail);

        JMenuItem studentLeaveDetail = new JMenuItem("Student Leave Details");
        studentLeaveDetail.setForeground(Color.BLACK);
        LeaveDetails.add(studentLeaveDetail);

        //Exam
        JMenu Exam = new JMenu("Examination");
        Exam.setForeground(Color.BLACK);
        mb.add(Exam);

        JMenuItem ExaminationDetail = new JMenuItem("Examination Result");
        ExaminationDetail.setForeground(Color.BLACK);
        Exam.add(ExaminationDetail);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setForeground(Color.BLACK);
        Exam.add(EnterMarks);

        //update info
        JMenu UpdateInfo = new JMenu("Update Details");
        UpdateInfo.setForeground(Color.BLACK);
        mb.add(UpdateInfo);

        JMenuItem UpdateFacultyInfo = new JMenuItem("Update Faculty Details");
        UpdateFacultyInfo.setForeground(Color.BLACK);
        UpdateInfo.add(UpdateFacultyInfo);

        JMenuItem Updatestudentinfo  = new JMenuItem("Update Student Details");
        Updatestudentinfo.setForeground(Color.BLACK);
        UpdateInfo.add(Updatestudentinfo);

        //fees
        JMenu Fee = new JMenu("Fee Details");
        Fee.setForeground(Color.BLACK);
        mb.add(Fee);

        JMenuItem FeeStructure = new JMenuItem("Fee Structure");
        FeeStructure.setForeground(Color.BLACK);
        Fee.add(FeeStructure);

        JMenuItem FeeForm  = new JMenuItem("Fee Form");
        FeeForm.setForeground(Color.BLACK);
        Fee.add(FeeForm);

        //utility
        JMenu Utility = new JMenu("utility");
        Utility.setForeground(Color.BLACK);
        mb.add(Utility);

        JMenuItem Calculator = new JMenuItem("Calculator");
        Calculator.setForeground(Color.BLACK);
        Calculator.addActionListener(this);
        Utility.add(Calculator);

        JMenuItem Notepad  = new JMenuItem("Notepad");
        Notepad.setForeground(Color.BLACK);
        Notepad.addActionListener(this);
        Utility.add(Notepad);

        //about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setForeground(Color.BLACK);
        about.add(About);

        //exit this program
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setForeground(Color.BLACK);
        Exit.addActionListener(this);
        exit.add(Exit);

        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
       if(sm.equals("Exit")){
           System.exit(0);
       }else if(sm.equals("Calculator")){
           try{
               Runtime.getRuntime().exec("calc.exe");
           } catch (Exception E) {
               E.printStackTrace();
           }
       }else if(sm.equals("Notepad")){
           try{
               Runtime.getRuntime().exec("notepad.exe");
           }catch(Exception EX){
               EX.printStackTrace();
           }
       }
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        new main_class();
    }

}


