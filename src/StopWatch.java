import java.util.Arrays;

public class StopWatch {
    private long startTime, endTime;

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void End() {
        this.endTime = System.currentTimeMillis();
    }

    public int getStartTime() {
        return (int) (this.startTime / 1000.0) ;
    }

    public int getEndTime() {
        return (int) (this.endTime / 1000.0);
    }
    public int getElapsedTime() {
        return (int) ((endTime - startTime) /1000.0 );
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000000) + 0;
        }
        System.out.println("Mảng khi chưa sắp xếp: \n" + Arrays.toString(arr));

        stopWatch.Start();

        int i,imin,j,temp;
            for (i = 0; i < arr.length ; i++)
            {
                imin = arr[i]; //Tìm imin
                for (j = i+1; j <= arr.length - 1; j++) {
                    if (arr[j] < imin) {
                        imin = arr[j];

                        //Hoán đổi a[i] và a[j]
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
         stopWatch.End();
        System.out.println("Mảng sau khi sắp xếp:\n "+ Arrays.toString(arr));
        System.out.println("Thời gian bắt đầu ở giây thứ: "+ stopWatch.getStartTime());
        System.out.println("Thời gian kết thúc ở giây thứ: "+ stopWatch.getEndTime());
        System.out.println("Thời gian cần khi sắp xếp lại mảng là: " + stopWatch.getElapsedTime() +"s");
    }
}
