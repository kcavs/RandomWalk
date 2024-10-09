public class randomWalk{
    public static void main(String[]args){
        double c=0;
        for(int i=0;i<50;i++){
            int pos=(int)((Math.random()*2)+3);
            boolean fin=false;
            while(fin==false){
                double x= Math.random();
                c+=1;
                if(x>0.4){
                    pos+=1;
                }
                if(x<0.5){
                    pos-=1;
                }
                if((pos>7)||(pos<0)){
                    fin=true;
                }
            }
        }
        double average;
        average=c/50;
        System.out.println("the person took and average of "+c+" steps before walking off");
    }
}