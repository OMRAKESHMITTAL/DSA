public class Searchinstringd {
    public static void main(String[] args) {
        String a = "ommittal";
        System.out.println(searchinstring(a, 'i'));
    }

    static boolean searchinstring(String a, char b) {
        if(a.length() == 0 ){
            return false;
        }
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b){
                return true;
            }
        }
        return false;
    }
}
