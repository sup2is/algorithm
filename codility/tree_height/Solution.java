//tree_height https://app.codility.com/programmers/trainings/4/tree_height/start/ Complete


class Solution {

    static int depth;

    public int solution(Tree T) {

        depth = 0;

        recursive(T, 0);

        return depth;
    }

    private void recursive(final Tree t, final int i) {

        depth = Math.max(i , depth);

        if(t.l != null) {
            recursive(t.l, i + 1);
        }
        if(t.r != null) {
            recursive(t.r, i + 1);
        }

    }
  
    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
}
