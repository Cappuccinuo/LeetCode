class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head == null) {
            return;
        }
        printLinkedListInReverse(head.getNext());
        head.printValue();
    }
}

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.getNext();
        }
        while (!stack.isEmpty()) {
            stack.pop().printValue();
        }
    }
}

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        int numNodesCount = getNumNodesCount(head);
        for (int i = numNodesCount; i >= 1; i--) {
            printNthNode(head, i);
        }
    }
    
    private void printNthNode(ImmutableListNode head, int index) {
        ImmutableListNode node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        node.printValue();
    }
    
    private int getNumNodesCount(ImmutableListNode head) {
        int count = 0;
        ImmutableListNode node = head;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }
}

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        // Time: O(n)
        int numNodesCount = getNumNodesCount(head);
        
        // Time: O(n) Space: O(sqrt(n))
        int step = (int)Math.sqrt(numNodesCount) + 1;
        Stack<ImmutableListNode> headNodes = new Stack<>();
        addNodeWithStep(head, step, headNodes);
        
        // Time: O(n) Space: O(sqrt(n))
        printEachHeadNodesInReverseOrder(headNodes);
    }
    
    private int getNumNodesCount(ImmutableListNode head) {
        int count = 0;
        ImmutableListNode node = head;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }
    
    private void addNodeWithStep(ImmutableListNode head, int step, Stack<ImmutableListNode> headNodes) {
        ImmutableListNode node = head;
        int i = 0;
        while (node != null) {
            if (i % step == 0) {
                headNodes.push(node);
            }
            node = node.getNext();
            i++;
        }
    }
    
    private void printEachHeadNodesInReverseOrder(Stack<ImmutableListNode> headNodes) {
        ImmutableListNode startNode = null;
        ImmutableListNode endNode = null;
        ImmutableListNode tempNode = null;
        
        while (!headNodes.isEmpty()) {
            endNode = startNode;
            startNode = headNodes.pop();
            tempNode = startNode;
            
            Stack<ImmutableListNode> stack = new Stack<>();
            while (tempNode != endNode) {
                stack.push(tempNode);
                tempNode = tempNode.getNext();
            }
            
            while (!stack.isEmpty()) {
                stack.pop().printValue();
            }
        }
    }
}