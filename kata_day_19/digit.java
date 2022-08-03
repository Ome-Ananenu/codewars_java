try {
         double num = Double.parseDouble(s.trim());
         return true;
      }
      catch (NumberFormatException e) {
        return false;
      }
      