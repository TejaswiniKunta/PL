fun a(x,y) =
let val z = 2
    in [x,y,z]
end;

fun b(x) =
let val s = 2
    in s::x
end;

fun c(x,flag) =
if flag= true then
let val a = x+2 in (a,flag) end
else (0,flag) ;

fun d(x,flag) =
if flag = false then
    let val flag2 = [false]
        in (x+1,flag::flag2) end
else let val flag2 =[true]
    in (x+2,flag::flag2) end;

fun e(x,flag) =
if x>0 then
    if flag = true then
            [(x,flag)] else [(0,flag)]
    else
        let val a = x*2
                in [(a,flag)] end;

val x = length [1,2,3];