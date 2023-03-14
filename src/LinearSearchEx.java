public class LinearSearchEx {
    public static void main(String[] args) {
        if (searching()) {
            System.out.println(" value is found");
        } else {
            System.out.println("value is not found");
        }
    }
        public static boolean searching(){
        int[] arr = {1, 20, 40, 60, 50, 80};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 40) {
                System.out.println("true");
                return true;
            }
            }
            return false;
        }
    }

