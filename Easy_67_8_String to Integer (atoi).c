int myAtoi(char* str) {
    long l = atol(str);
    if(l>2147483647)
        return 2147483647;
    else if(l<-2147483648)
        return -2147483648;
    else
        return (int)l;
}
