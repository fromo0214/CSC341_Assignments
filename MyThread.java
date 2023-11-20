
public class MyThread extends Thread{
        private int sum;
        private int upper;

        public MyThread(int upper){
           this.upper = upper;
           sum = 0; 
        }


        public void run(){
            for(int i = 1; i <= upper; i ++){
                sum += i;
            }
        }

        public int getSum() {
            return sum;
        }
    }