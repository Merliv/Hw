#1
sonlst = []
def lstayirma(lst):
    for i in lst:
        if type(i) == list:
            lstayirma(i)
        else:
            sonlst.append(i)

    return sonlst


print(lstayirma([[1,'a',['cat'],2],[[[3]],'dog'],4,5]))
#2
lastlst = []
def ters(lst):
    lastlst = lst[::-1]
    return lastlst

print(ters([[1,'a',['cat'],2],[[[3]],'dog'],4,5]))

