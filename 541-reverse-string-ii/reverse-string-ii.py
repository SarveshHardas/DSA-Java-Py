class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        S = list(s)

        for i in range(0,len(S),2*k):
            S[i:i+k] = reversed(S[i:i+k])

        return ''.join(S)