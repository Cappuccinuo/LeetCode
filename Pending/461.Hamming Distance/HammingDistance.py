class Solution(object):
	def HammingDistance(self x,y):
		return bin(x^y).count('1') 
