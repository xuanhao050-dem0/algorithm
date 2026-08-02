package com.bit.BFS;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.cn/problems/flood-fill/
public class Flood {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0,0};
        int prev = image[sr][sc]; // 统计刚开始的颜色
        if(prev == color) return image; // 处理边界情况
        int m = image.length, n = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        while(!q.isEmpty())
        {
            int[] t = q.poll();
            int a = t[0], b = t[1];
            image[a][b] = color;
            // 上下左右四个方向
            for(int i = 0; i < 4; i++)
            {
                int x = a + dx[i], y = b + dy[i];
                if(x >= 0 && x < m && y >= 0 && y < n && image[x][y] == prev)
                {
                    q.add(new int[]{x, y});
                }
            }
        }

    }
}
