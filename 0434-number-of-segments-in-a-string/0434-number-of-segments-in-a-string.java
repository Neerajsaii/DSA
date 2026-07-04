class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        String[] segment = s.split("\\s+");
        return segment.length;
    }
}