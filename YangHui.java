import java.util.ArrayList;
import java.util.List;
public class YangHui {
    public List<List<Integer>> gernerate (int numRows){
        if(numRows <= 0){   //如果nusRows<=0,直接返回一个空的List
            return new ArrayList<>();
        }
     List<List<Integer>> result = new ArrayList<>(); //定义结果的二维List
        List<Integer> firstLine = new ArrayList<>(); //定义第一行的List
        firstLine.add(1);  //写杨辉三角第一行
        result.add(firstLine);  //将第一行的List放入result的List
        if(numRows == 1){
            return result; //如果numRows为1就直接返回result
        }
        List<Integer> secondLine = new ArrayList<>();//定义第二行的List
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine); //将第二行的List放入result的List
        if(numRows == 2){
            return result;  //如果numRows为1就直接返回result
        }
        for(int row = 3; row <= numRows ; row++){
            //第一次减一是为了到row-1行 第二次减一是为了获取row-1行的下标
            List<Integer> prevLine = result.get(row - 1 - 1);  //定义了当前行前一行的List
            List<Integer> curLine = new ArrayList<>();   //定义了一个当前行的List
            curLine.add(1);
            for(int rol = 2; rol < row ; rol++){//循环了row-2次
                 int curNum =  prevLine.get(rol -1-1) + prevLine.get(rol-1);
                 curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);  //将本行List放入result
        }
        return result;  //返回result
    }

    public static void main(String[] args) {
        YangHui yangHui = new YangHui();
        System.out.println(yangHui.gernerate(4));
    }
}