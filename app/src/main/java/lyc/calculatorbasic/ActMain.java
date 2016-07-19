package lyc.calculatorbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;

public class ActMain extends AppCompatActivity {

    double n1=0,nShowed=0;//暫存值,顯示值
    String op="";
    boolean opIf = false,pointIf=false;
    DecimalFormat formater=new DecimalFormat("0.00000");

    View.OnClickListener btn0_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //若前一下沒按op
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("0");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"0");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("0");
            }
        }
    };
    View.OnClickListener btn1_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                //
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("1");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"1");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("1");
            }
        }
    };
    View.OnClickListener btn2_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("2");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"2");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("2");
            }
        }
    };
    View.OnClickListener btn3_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("3");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"3");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("3");
            }
        }
    };
    View.OnClickListener btn4_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("4");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"4");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("4");
            }
        }
    };
    View.OnClickListener btn5_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("5");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"5");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("5");
            }
        }
    };
    View.OnClickListener btn6_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("6");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"6");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("6");
            }
        }
    };
    View.OnClickListener btn7_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("7");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"7");
                    opIf=false;
                }

            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("7");
            }
        }
    };
    View.OnClickListener btn8_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("8");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"8");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("8");
            }
        }
    };
    View.OnClickListener btn9_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(opIf==false){
                nShowed = Double.parseDouble(lblNumber.getText().toString());
                if(lblNumber.getText().toString().equals("0")){
                    opIf=false;
                    lblNumber.setText("9");
                }
                else{
                    lblNumber.setText(lblNumber.getText().toString()+"9");
                    opIf=false;
                }
            }

            //若前一下有按op
            else {
                opIf=false;
                lblNumber.setText("9");
            }
        }
    };
    View.OnClickListener btn加_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            nShowed = Double.parseDouble(lblNumber.getText().toString());

            if(lblAri.getText().toString().equals(" ")){
                lblAri.setText(String.valueOf(nShowed)+ "+");
                n1 = nShowed;
                op = "+";
                opIf= true;
            }
            else {//若lblAri不為空
                if(opIf==true){//若前一個按的是op
                    lblAri.setText(lblAri.getText().toString().substring(0,lblAri.getText().toString().length()-1)+ "+");
                    op = "+";
                    opIf= true;
                }
                else {//若前一個按的不是op
                    if(op.equals("+")){
                        n1 += nShowed;
                    }
                    else if(op.equals("-")){
                        n1 -= nShowed;
                    }
                    else if(op.equals("*")){
                        n1 *= nShowed;
                    }else if(op.equals("/")){
                        n1 /= nShowed;
                    }

                    String newAri = lblAri.getText().toString()+String.valueOf(nShowed)+"+";
                    lblAri.setText(newAri);
                    lblNumber.setText(String.valueOf(n1));
                    //lblNumber.setText(formater.format(n1));
                    op = "+";
                    opIf= true;
                }

            }

        }
    };
    View.OnClickListener btn減_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            nShowed = Double.parseDouble(lblNumber.getText().toString());

            if(lblAri.getText().toString().equals(" ")){
                lblAri.setText(String.valueOf(nShowed)+ "-");

                n1 = nShowed;
                op = "-";
                opIf= true;
            }
            else {//若lblAri不為空
                if(opIf==true){//若前一個按的是op
                    lblAri.setText(lblAri.getText().toString().substring(0, lblAri.getText().toString().length() - 1)+ "-");
                    op = "-";
                    opIf= true;
                }
                else {//若前一個按的不是op
                    if(op.equals("+")){
                        n1 += nShowed;
                    }
                    else if(op.equals("-")){
                        n1 -= nShowed;
                    }
                    else if(op.equals("*")){
                        n1 *= nShowed;
                    }else if(op.equals("/")){
                        n1 /= nShowed;
                    }

                    String newAri = lblAri.getText().toString()+String.valueOf(nShowed)+"-";
                    lblAri.setText(newAri);
                    lblNumber.setText(String.valueOf(n1));
                    //lblNumber.setText(formater.format(n1));

                    op = "-";
                    opIf= true;
                }

            }

        }
    };
    View.OnClickListener btn乘_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            nShowed = Double.parseDouble(lblNumber.getText().toString());

            if(lblAri.getText().toString().equals(" ")){
                lblAri.setText(String.valueOf(nShowed)+ "*");
                n1 = nShowed;
                op = "*";
                opIf= true;
            }
            else {//若lblAri不為空
                if(opIf==true){//若前一個按的是op
                    lblAri.setText(lblAri.getText().toString().substring(0, lblAri.getText().toString().length() - 1)+ "*");
                    op = "*";
                    opIf= true;
                }
                else {//若前一個按的不是op
                    if(op.equals("+")){
                        n1 += nShowed;
                    }
                    else if(op.equals("-")){
                        n1 -= nShowed;
                    }
                    else if(op.equals("*")){
                        n1 *= nShowed;
                    }else if(op.equals("/")){
                        n1 /= nShowed;
                    }

                    String newAri = lblAri.getText().toString()+String.valueOf(nShowed)+"*";
                    lblAri.setText(newAri);
                    lblNumber.setText(String.valueOf(n1));
                    //lblNumber.setText(formater.format(n1));

                    op = "*";
                    opIf= true;
                }

            }
        }
    };
    View.OnClickListener btn除_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            nShowed = Double.parseDouble(lblNumber.getText().toString());

            if(lblAri.getText().toString().equals(" ")){
                lblAri.setText(String.valueOf(nShowed)+ "/");
                n1 = nShowed;
                op = "/";
                opIf= true;
            }
            else {//若lblAri不為空
                if(opIf==true){//若前一個按的是op
                    lblAri.setText(lblAri.getText().toString().substring(0, lblAri.getText().toString().length() - 1)+ "/");
                    op = "/";
                    opIf= true;
                }
                else {//若前一個按的不是op
                    if(op.equals("+")){
                        n1 += nShowed;
                    }
                    else if(op.equals("-")){
                        n1 -= nShowed;
                    }
                    else if(op.equals("*")){
                        n1 *= nShowed;
                    }else if(op.equals("/")){
                        n1 /= nShowed;
                    }

                    String newAri = lblAri.getText().toString()+String.valueOf(nShowed)+"/";
                    lblAri.setText(newAri);
                    lblNumber.setText(String.valueOf(n1));
                    //lblNumber.setText(formater.format(n1));

                    op = "/";
                    opIf= true;
                }

            }
        }
    };
    View.OnClickListener btn點_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            String strPoint = lblNumber.getText().toString();
            //if 字串中不包含.
            if (strPoint.indexOf(".")==-1) {
                lblNumber.setText(lblNumber.getText().toString()+".");
            }
            else {
                return;
            }

        }
    };
    View.OnClickListener btn等於_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            lblAri.setText(" ");
            nShowed = Double.parseDouble(lblNumber.getText().toString());
            if(opIf==true){
                lblNumber.setText(String.valueOf(n1));
                n1=0;
                op="";
                opIf = true;
            }
            else {
                if(op.equals("+")){
                    n1 += nShowed;
                }
                else if(op.equals("-")){
                    n1 -= nShowed;
                }
                else if(op.equals("*")){
                    n1 *= nShowed;
                }else if(op.equals("/")){
                    n1 /= nShowed;
                }

                lblNumber.setText(String.valueOf(n1));
                //lblNumber.setText(formater.format(n1));
                n1=0;
                op="";
                opIf = true;
            }
        }
    };
    View.OnClickListener btn刪除_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            String strNum = lblNumber.getText().toString();
            if(strNum.equals("0") ||strNum.equals("1") ||strNum.equals("2")
                    ||strNum.equals("3") ||
                    strNum.equals("4") ||strNum.equals("5") ||strNum.equals("6") ||
                    strNum.equals("7") ||strNum.equals("8") ||strNum.equals("9") ){
                lblNumber.setText("0");
            }
            else {
                lblNumber.setText(lblNumber.getText().toString().substring(
                        0,lblNumber.getText().toString().length()-1));
            }
        }
    };
    View.OnClickListener btn清除_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            n1=0;
            nShowed=0;//暫存值,顯示值
            op="";
            opIf = false;
            lblAri.setText(" ");
            lblNumber.setText("0");
        }
    };
    View.OnClickListener btn平方_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //nShowed = Integer.parseInt(lblNumber.getText().toString());
            double numSqu = Double.parseDouble(lblNumber.getText().toString());
            //numSqu=Math.pow(numSqu, 2);
            numSqu = numSqu*numSqu;
            lblNumber.setText(String.valueOf(numSqu));
            opIf = true;
        }
    };
    View.OnClickListener btn根號_Click = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //nShowed = Integer.parseInt(lblNumber.getText().toString());
            double numSqu = Double.parseDouble(lblNumber.getText().toString());
            numSqu=Math.sqrt(numSqu);
            lblNumber.setText(String.valueOf(numSqu));
            opIf = true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        InitialComponent();
    }


    private void InitialComponent(){

        btn0=(Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(btn0_Click);
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_Click);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_Click);
        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_Click);
        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_Click);
        btn5=(Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_Click);
        btn6=(Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(btn6_Click);
        btn7=(Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_Click);
        btn8=(Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_Click);
        btn9=(Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_Click);
        btn加=(Button)findViewById(R.id.btnPlus);
        btn加.setOnClickListener(btn加_Click);
        btn減=(Button)findViewById(R.id.btnMin);
        btn減.setOnClickListener(btn減_Click);
        btn乘=(Button)findViewById(R.id.btnMulti);
        btn乘.setOnClickListener(btn乘_Click);
        btn除=(Button)findViewById(R.id.btnDiv);
        btn除.setOnClickListener(btn除_Click);
        btn等於=(Button)findViewById(R.id.btnOk);
        btn等於.setOnClickListener(btn等於_Click);
        btn點=(Button)findViewById(R.id.btnPoint);
        btn點.setOnClickListener(btn點_Click);
        btn刪除=(Button)findViewById(R.id.btnDelete);
        btn刪除.setOnClickListener(btn刪除_Click);
        btn清除=(Button)findViewById(R.id.btnClear);
        btn清除.setOnClickListener(btn清除_Click);
        btn平方=(Button)findViewById(R.id.btnSquare);
        btn平方.setOnClickListener(btn平方_Click);
        btn根號=(Button)findViewById(R.id.btnRoot);
        btn根號.setOnClickListener(btn根號_Click);
        lblNumber=(TextView)findViewById(R.id.lblNumber);
        lblAri=(TextView)findViewById(R.id.lblAri);
    }

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn點;
    Button btn刪除;
    Button btn清除;
    Button btn平方;
    Button btn根號;
    Button btn加;
    Button btn減;
    Button btn乘;
    Button btn除;
    Button btn等於;
    TextView lblNumber;
    TextView lblAri;
}
