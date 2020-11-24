public class LoopArray {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "apple";
        users[1] = "banana";
        users[2] = "carrot";

        String[] names = new String[3];
        names[0] = "fluit";
        names[1] = "fluit";
        names[2] = "vegetable";
        
        for(int i=0; i<users.length; ++i) {
            System.out.println("<li>"+users[i]+"</li>");

            if(i < users.length-1){System.out.println(names[i]+",");
            } else {
                System.out.println(names[i]+".");
            }
        }
        return;
    }
}

/*
++i는 내부적으로 다음과 같이 동작한다.

1. i의 값을 1 더한다.

2. i의 값을 반환한다.



i++는 내부적으로 다음과 같이 동작한다.

1. i의 현재 값을 보관한다. (현재 실행되는 명령문에서는 이 보관된 값이 사용되어야 하니까)

2. i의 값을 1 더한다.

3. 보관했던 값을 반환한다.
*/