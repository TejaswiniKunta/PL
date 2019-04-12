datatype days =  sunday| monday| tuesday| wednesday| thursday| friday| saturday;
fun isWeekend sunday = true
               | isWeekend saturday = true
               | isWeekend monday = false
               | isWeekend tuesday = false
               | isWeekend wednesday = false
               | isWeekend thursday = false
               | isWeekend friday = false;
