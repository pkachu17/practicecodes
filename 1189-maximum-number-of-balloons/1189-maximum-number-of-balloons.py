class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        count = Counter(text)
        balloon = Counter("balloon")
        result = len(text)
        for c in balloon:
            result = min(result, count[c] // balloon[c])
        return result
        