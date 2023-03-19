
class Solution:
	def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
		ret = defaultdict(list)

		def compress(node,c,r):
			ret[c].append((r,node.val))

			if node.left:
				compress(node.left,c-1,r+1)
			if node.right:
				compress(node.right,c+1,r+1)

		compress(root,0,0)
		ans = []

		for k in sorted(ret.keys(), key = lambda x: (x,ret[x][0])):
			ans.append([v for _,v in sorted(ret[k])])
		return ans
