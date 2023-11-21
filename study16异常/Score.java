package study16异常;

    public class Score {
            public static void setScore(int score) throws ScoreException {
                if(score<0||score>100){
                    throw new ScoreException("你输入的分数有误，请重新输入");
                }
                else
                {
                    System.out.println("分数保存成功");
                }
            }
}
