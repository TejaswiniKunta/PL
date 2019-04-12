
fun rrr(array) =
    let val y = listmin(array) in
        let fun remElem(x,l) =
            let fun rem(e,list,nl) =
            if list = [] then nl else
                let val element = hd(list) in
                if e= element then rem(e,tl(list),nl) else rem(e,tl(list),element::nl)
                end
            in rem(x,l,[])
            end
        in remElem(y,array) end
        end;
