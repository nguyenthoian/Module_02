﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace SalesWebMvc.Services.Exceptions
{
    public class EqualException : ApplicationException
    {
        public EqualException (string message) : base(message)
        {
        }
    }
}
