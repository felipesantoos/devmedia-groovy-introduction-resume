// Intervalo inclusivo.
myRange = 1..10
for (int i = 0; i < myRange.size(); i++) {
    post = i == myRange.size()-1 ? '\n' : ', '
    print("${myRange[i]}${post}")
}
