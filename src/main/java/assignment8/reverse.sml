fun reverse(r) =[]
| reverse(r) =
let fun rev(x,y) =
    if x = [] then y
    else rev(tl(x),hd(x)::y)
    in rev(r,[]) end;

