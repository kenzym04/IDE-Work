def maximalPalindrome(s):
    # ct[ch] = n 
    # this means we can use character 'ch' at most 'n' times.
    ct = {}
    for ch in s:
        ct[ch] = ct.get(ch, 0) + 1
        
    ret = []
    middle = ''
    for ch in sorted(ct.keys()):
        avail = ct.get(ch, 0)
        for _ in range(avail // 2):
            ret.append(ch)
            
        if middle == '' and avail % 2 == 1:
            middle = ch
        
    firstHalf = ''.join(ret)
    return firstHalf + middle + firstHalf[::-1]
