class Solution {
    public String simplifyPath(String path) {
        Deque<String> paths = new ArrayDeque<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            switch (part) {
                case "":
                case ".":
                    continue;
                    case "..": {
                        if (!paths.isEmpty()) {
                            paths.removeLast();
                        }
                    }
                    break;
                    default:
                    paths.addLast(part);
            }
        } 
        StringBuilder ret = new StringBuilder();
        while (!paths.isEmpty()) {
            ret.append('/').append(paths.removeFirst());
        }
        if (ret.isEmpty()) {
            ret.append('/');
        }
        return ret.toString();
    }
}