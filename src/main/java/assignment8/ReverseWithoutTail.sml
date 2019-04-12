fun reverse(x) =
    if x = [] then x
    else reverse(tl(x))@[hd(x)];