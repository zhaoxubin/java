public class RealizeReplace {
    public static void main(String[] args) {
        String str = "abacadaeaf";
        String result = replace(str,'a','_');
        System.out.println(result);
    }
    public static String replace(String str,char rep,char toRep){  
        //str为要被修改的字符串，rep为字符串要被修改的字符，
        // toRep为修改字符串中的rep字符的内容
        char[] data = str.toCharArray(); //将字符串转为字符数组，在数组中修改
        for(int i = 0 ; i < data.length; i++){
            if(data[i] == rep){
               data[i] = toRep;  //如果rep与数组元素相等就更改
            }
        }
        return new String(data);  //返回时将数组转为字符串
    }
}