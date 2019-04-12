

fun listmin(array) =
    let fun minList(list,min) =
         if list = [] then min
         else
            let val m = min in
                if m > hd(list) then listMin(tl(list), hd(list)) else listMin(tl(list),m)
            end;
    in minList(array,hd(array))
    end;