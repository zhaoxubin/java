public static boolean isNumber(String str){
    char[] data = str.toCharArray();
    for(int i = 0; i < data.length; i++){
        if(data[i] < '0' || data[i] > '9'){
            return false;
        }
    }
    return true;
} 