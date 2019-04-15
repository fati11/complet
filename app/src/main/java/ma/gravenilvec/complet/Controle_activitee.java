package ma.gravenilvec.complet;


import android.app.Activity;

public class Controle_activitee {
    private static Controle_activitee Ca;
    private Activity Activity1,Activity2,Activity3,Activity4,Activity5,Activity6,Activity7,Activity8,Activity9,Activity10,Activity11,Activity12,Activity13,Activity14,Activity15,Activity16,Activity17,Activity18,Activity19,Activity20;
    public Controle_activitee() {
    }
    public static synchronized Controle_activitee getCa(){
        if(Ca==null){
            Ca=new Controle_activitee();
        }
        return Ca;
    }
    public void setActivity1(Activity activityObject){
        Activity1= activityObject;
    }
    public void setActivity2(Activity activityObject){
        Activity2= activityObject;
    }
    public void setActivity3(Activity activityObject){
        Activity3= activityObject;
    }
    public void setActivity4(Activity activityObject){
        Activity4= activityObject;
    }
    public void setActivity5(Activity activityObject){
        Activity5= activityObject;
    }
    public void setActivity6(Activity activityObject){
        Activity6= activityObject;
    }
    public void setActivity7(Activity activityObject){
        Activity7= activityObject;
    }
    public void setActivity8(Activity activityObject){
        Activity8= activityObject;
    }
    public void setActivity9(Activity activityObject){
        Activity9= activityObject;
    }
    public void setActivity10(Activity activityObject){
        Activity10= activityObject;
    }
    public void setActivity11(Activity activityObject){
        Activity11= activityObject;
    }
    public void setActivity12(Activity activityObject){
        Activity12= activityObject;
    }
    public void setActivity13(Activity activityObject){
        Activity13= activityObject;
    }
    public void setActivity14(Activity activityObject){  Activity14= activityObject;}
    public void setActivity15(Activity activityObject){
        Activity15= activityObject;
    }
    public void setActivity16(Activity activityObject){
        Activity16= activityObject;
    }
    public void setActivity17(Activity activityObject){
        Activity17= activityObject;
    }
    public void setActivity18(Activity activityObject){
        Activity18= activityObject;
    }
    public void setActivity19(Activity activityObject){
        Activity19= activityObject;
    }
    public void setActivity20(Activity activityObject){  Activity20= activityObject;}


    public Activity getActivity1() {
        return Activity1;
    }

    public Activity getActivity2() {
        return Activity2;
    }

    public Activity getActivity3() {
        return Activity3;
    }

    public Activity getActivity4() {
        return Activity4;
    }

    public Activity getActivity5() {
        return Activity5;
    }

    public Activity getActivity6() {
        return Activity6;
    }

    public Activity getActivity7() {
        return Activity7;
    }

    public Activity getActivity8() {
        return Activity8;
    }

    public Activity getActivity9() {
        return Activity9;
    }

    public Activity getActivity10() {
        return Activity10;
    }

    public Activity getActivity11() {
        return Activity11;
    }
    public Activity getActivity12() {
        return Activity12;
    }
    public Activity getActivity13() {
        return Activity13;
    }
    public Activity getActivity14() {
        return Activity14;
    }
    public Activity getActivity15() {
        return Activity10;
    }

    public Activity getActivity16() {
        return Activity11;
    }
    public Activity getActivity17() {
        return Activity12;
    }
    public Activity getActivity18() {
        return Activity13;
    }
    public Activity getActivity19() {
        return Activity14;
    }
    public Activity getActivity20() {
        return Activity14;
    }
    public void terminerActivitees(){
        if(Activity1!=null)
            Activity1.finish();
        if(Activity2!=null)
            Activity2.finish();
        if(Activity3!=null)
            Activity3.finish();
        if(Activity4!=null)
            Activity4.finish();
        if(Activity5!=null)
            Activity5.finish();
        if(Activity6!=null)
            Activity6.finish();
        if(Activity7!=null)
            Activity7.finish();
        if(Activity8!=null)
            Activity8.finish();
        if(Activity9!=null){
            Activity9.finish();
        }
        if(Activity10!=null){
            Activity10.finish();
        }
        if(Activity11!=null){
            Activity11.finish();
        }
        if(Activity12!=null){
            Activity12.finish();
        }
        if(Activity13!=null){
            Activity13.finish();
        }
        if(Activity14!=null){
            Activity14.finish();
        }
        if(Activity15!=null){
            Activity15.finish();
        }
        if(Activity16!=null){
            Activity16.finish();
        }
        if(Activity17!=null){
            Activity17.finish();
        }
        if(Activity18!=null){
            Activity18.finish();
        }
        if(Activity19!=null){
            Activity19.finish();
        }
        if(Activity20!=null){
            Activity20.finish();
        }
    }
}
