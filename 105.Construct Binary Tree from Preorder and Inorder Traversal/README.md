Basic idea:</br>
We have two arrays: preorder and inorder</br>
<strong>preorder travelsal: root->root.left->root.right</strong></br>
<strong>inorder travelsal:  root.left->root->root.right</strong></br>
preorder implies that <strong>preorder[0] is the root</strong></br>
Then we can find preorder[0] in inorder, say that's inorder[5]</br>
So inorder[0]-inorder[4] is on the left side, and inorder[6] is on the right side</br>
Recursively doing this on subarrays and then we can build a binary tree.</br>

Problems:</br>
`if (preStart > preorder.length - 1 || inStart > inEnd) {return null;}`</br>
if we don't execute the corner case, the system will throw exception.
