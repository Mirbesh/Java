stroka = 'по-русски говорят'

# def ritm(stro):
#     fraza=[]
#     glasnye = "ауоыиэяюёе"
#     if len(stroka.split()) < 2:
#         print("Количество фраз должно быть больше одной!")
#     else:
#         for text in stro.split():
#             i = 0
#             for bukvy in text:
#                 if (bukvy).lower() in glasnye:
#                     i += 1
#             if i != 0 and i % 2 == 0:
#                 fraza.append(text)
#         if stro == (" ".join(fraza)):
#             print("Парам пам-пам")
#         else:
#             print("Пам парам")
# ritm(stroka)

def ritm(stro):
    fraza=[]
    glasnye = "ауоыиэяюёе"
    if len(stroka.split()) < 2:
        print("Количество фраз должно быть больше одной!")
    else:
        i = 0
        for bukvy in stro:
            if (bukvy).lower() in glasnye:
                i += 1
        if i != 0 and i % 2 == 0:
            print("Парам пам-пам")
        else:
            print("Пам парам")
ritm(stroka)