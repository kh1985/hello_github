import java.io.File;

class Hello
{
    // テストクラスやで
    // 2回目やで
    // githubに変更分コミットやで
    // masterやで
    public static void main(String args[])
    {
        System.out.println("hello");

        File f = new File("/Users/kenjihachiya/Desktop/work/test/Hello.java");

        if(f.canRead())
        {
            System.out.println("読み込みOK");
        }else
        {
            System.out.println("読み込みNG");
        }
    }
}